package com.github.harryssuperman.genpro.parser;

import org.springframework.stereotype.Component;

import com.github.harryssuperman.genpro.enums.GenProMainOperation;
import com.github.harryssuperman.genpro.enums.GenProOperationObject;
import com.github.harryssuperman.genpro.exceptions.GenProArgumentsException;

@Component
public class GenProConsoleParser implements GenProParser {

    @Override
    public GenProParserValues parse(String[] args) {
        final GenProParserValues genProParserMapValues = new GenProParserValues(args);
        parseArgValues(genProParserMapValues, args);
        return genProParserMapValues;
    }

    private void parseArgValues(GenProParserValues genProParserMapValues, String[] args) {
        parseMainOperation(genProParserMapValues, args);
        parseOperationObjects(genProParserMapValues, args);
        parseRestArguments(genProParserMapValues, args);
    }

    private void parseRestArguments(GenProParserValues genProParserMapValues, String[] args) {
        if (isCorrectArgumentsNumber(genProParserMapValues, args)) {
            setParserVariableValuesFromArgs(genProParserMapValues, args);
        } else {
            throw new GenProArgumentsException("Incorrect arguments for operation.");
        }
    }

    private void setParserVariableValuesFromArgs(GenProParserValues genProParserMapValues, String[] args) {
        final GenProMainOperation mo = genProParserMapValues.getMainOperation();
        final GenProOperationObject oo = genProParserMapValues.getOperationObject();
        GenProParserVariableValues variableValues = new GenProParserVariableValues();
        switch (args.length) {
            case 3:
                getVariableValuesFor3Arguments(args, mo, oo, variableValues);
            case 4:
                getVariableValuesFor4Arguments(args, mo, oo, variableValues);

            case 5:
                getVariableValuesFor5Arguments(args, mo, oo, variableValues);
            default:
                genProParserMapValues.setGenProParserVariableValues(new GenProParserVariableValues());
                ;
        }
        genProParserMapValues.setGenProParserVariableValues(variableValues);
        genProParserMapValues.setParsed(true);
    }


    private void getVariableValuesFor3Arguments(String[] args, GenProMainOperation mo, GenProOperationObject oo,
                                                GenProParserVariableValues variableValues) {
        if ((GenProMainOperation.DELETE.equals(mo) && GenProOperationObject.PROPERTY.equals(oo))) {
            variableValues.setFilePath(args[2]);
            variableValues.setEnvironment(args[3]);
        } else {
            variableValues.setPropertyName(args[2]);
            variableValues.setEnvironment(args[3]);
        }
    }

    private void getVariableValuesFor4Arguments(String[] args, GenProMainOperation mo, GenProOperationObject oo,
                                                GenProParserVariableValues variableValues) {
        if (GenProMainOperation.ADD.equals(mo)) {
            variableValues.setPropertyName(args[2]);
        } else {
            variableValues.setEnvironment(args[2]);
        }
    }

    private void getVariableValuesFor5Arguments(String[] args, GenProMainOperation mo, GenProOperationObject oo,
                                                GenProParserVariableValues variableValues) {
        variableValues.setPropertyName(args[2]);
        variableValues.setPropertyValue(args[3]);
        variableValues.setEnvironment(args[4]);
    }

    private boolean isCorrectArgumentsNumber(GenProParserValues genProParserMapValues, String[] args) {
        final GenProMainOperation mo = genProParserMapValues.getMainOperation();
        final GenProOperationObject oo = genProParserMapValues.getOperationObject();
        switch (args.length) {
            case 0:
                return false;
            case 1:
                return GenProMainOperation.GENERATE.equals(mo);
            case 2:
                return GenProMainOperation.LIST.equals(mo) && (GenProOperationObject.PROPERTY.equals(oo) || GenProOperationObject.ENVIRONMENT.equals(oo));
            case 3:
                return (GenProMainOperation.ADD.equals(mo) && GenProOperationObject.ENVIRONMENT.equals(oo)) || (GenProMainOperation.LIST.equals(mo) && GenProOperationObject.PROPERTY.equals(oo)) || (GenProMainOperation.DELETE.equals(mo) && (GenProOperationObject.PROPERTY.equals(oo) || GenProOperationObject.ENVIRONMENT.equals(oo)));
            case 4:
                return (GenProOperationObject.PROPERTY.equals(oo) && (GenProMainOperation.ADD.equals(mo) || GenProMainOperation.DELETE.equals(mo)));
            case 5:
                return GenProMainOperation.ADD.equals(mo) && GenProOperationObject.PROPERTY.equals(oo);
            default:
                return false;
        }
    }

    private void parseOperationObjects(GenProParserValues genProParserMapValues, String[] args) {
        if (!isGenerateOperation(genProParserMapValues)) {
            if (args.length > 1) {
                switch (args[1].toUpperCase()) {
                    case "ENVIRONMENT":
                        genProParserMapValues.setOperationObject(GenProOperationObject.ENVIRONMENT);
                        break;
                    case "PROPERTY":
                        genProParserMapValues.setOperationObject(GenProOperationObject.PROPERTY);
                        break;
                    default:
                        throw new GenProArgumentsException("Incorrect object operation for: " + args[1]);
                }
            } else {
                throw new GenProArgumentsException("Objectargument is not detected");
            }
        }
    }

    private boolean isGenerateOperation(GenProParserValues genProParserMapValues) {
        return GenProMainOperation.GENERATE.equals(genProParserMapValues.getMainOperation());
    }

    private void parseMainOperation(GenProParserValues genProParserMapValues, String[] args) {
        if (args.length > 0) {
            switch (args[0].toUpperCase()) {
                case "ADD":
                    genProParserMapValues.setMainOperation(GenProMainOperation.ADD);
                    break;
                case "LIST":
                    genProParserMapValues.setMainOperation(GenProMainOperation.LIST);
                    break;
                case "DELETE":
                    genProParserMapValues.setMainOperation(GenProMainOperation.DELETE);
                    break;
                case "GENERATE":
                    genProParserMapValues.setMainOperation(GenProMainOperation.GENERATE);
                    break;
                default:
                    throw new GenProArgumentsException("Incorrect main operation for: " + args[0]);
            }
        } else {
            throw new GenProArgumentsException("No main argument detected");
        }

    }
}

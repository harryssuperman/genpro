# genpro

GenPro is a project to allow developers generate Properties for multiple environments. The focus of the project is just define a set of properties
that are common for all the environments and an automation generation of the properties files for every environment including the common properties.

# Call Patterns

Available calls for the GenPro are:

genpro ADD ENVIRONMENT venvironment

genpro ADD PROPERTY vproperty_file venvironment

genpro ADD PROPERTY vproperty_name vproperty_value venvironment

genpro LIST ENVIRONMENT

genpro LIST PROPERTY

genpro LIST PROPERTY venvironment

genpro DELETE ENVIRONMENT venvironment

genpro DELETE PROPERTY vproperty_name

genpro DELETE PROPERTY vproperty_name venvironment

genpro GENERATE

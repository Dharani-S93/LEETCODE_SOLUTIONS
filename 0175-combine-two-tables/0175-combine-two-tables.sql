SELECT Person.firstName, Person.lastName, Address.city, Address.state
FROM person
LEFT JOIN Address
ON person.personId = Address.personId;
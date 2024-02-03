# Write your MySQL query statement below
select person.firstName , person.lastName, address.city, address.state from Person person left JOIN Address address on address.personId = person.personId;
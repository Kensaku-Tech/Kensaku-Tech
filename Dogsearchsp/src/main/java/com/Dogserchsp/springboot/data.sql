SELECT species,specialty
FROM dogs
WHERE
hair = ${hair},
size = ${size},
specialty LIKE '%${specialties}%'
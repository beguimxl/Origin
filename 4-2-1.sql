SELECT * FROM superheroes
SELECT superheroes.name, superheroes.power, superheroes.gender, details.age, details.country
FROM superheroes 
JOIN details 
ON superheroes.id = details.superheroes_id
WHERE age > 30
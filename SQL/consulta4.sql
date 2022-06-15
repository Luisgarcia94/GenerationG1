
-- SELECT*FROM Alumnos;
-- SELECT*FROM Grupos g;
-- Inner Join
select * 
FROM Alumnos a
inner join Grupos g 
on a.grupo_id= g.id;


-- LEFT Join

select * 
FROM Alumnos a
Left join Grupos g 
on a.grupo_id= g.id;

-- Right Join
select * 
FROM Alumnos a
Left join Grupos g 
on a.grupo_id= g.id;

SELECT*FROM Grupos

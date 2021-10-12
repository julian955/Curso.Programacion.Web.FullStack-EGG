SELECT * FROM jugadores;
SELECT * FROM equipos;
SELECT * FROM estadisticas;
SELECT * FROM partidos;
SELECT nombre FROM jugadores ORDER BY nombre;
SELECT nombre, Posicion,Peso FROM jugadores WHERE Posicion = 'C' AND peso > 200 ORDER BY nombre;
SELECT nombre FROM equipos ORDER BY nombre;
SELECT nombre,Conferencia FROM equipos WHERE Conferencia = 'East' ORDER BY nombre;
SELECT nombre,ciudad FROM equipos WHERE Ciudad LIKE 'C%' ORDER BY nombre;
SELECT nombre,nombre_equipo FROM jugadores ORDER BY Nombre_equipo;
SELECT nombre,nombre_equipo FROM jugadores WHERE Nombre_equipo ='Raptors' ORDER BY Nombre;
SELECT nombre,temporada,puntos_por_partido FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador WHERE nombre = 'Pau Gasol';
SELECT nombre,temporada,puntos_por_partido FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador WHERE nombre = 'Pau Gasol' AND temporada = '04/05';
SELECT nombre,ROUND(SUM(puntos_por_partido)) AS 'TOTAL PUNTOS' FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador GROUP BY jugador ORDER BY nombre;
SELECT Nombre_equipo,COUNT(Nombre) AS Jugadores from jugadores GROUP BY Nombre_equipo;
SELECT nombre,ROUND(SUM(puntos_por_partido)) AS 'TOTAL PUNTOS' FROM jugadores INNER JOIN estadisticas ON jugadores.codigo = estadisticas.jugador GROUP BY jugador ORDER BY ROUND(SUM(puntos_por_partido)) desc LIMIT 1 ;
SELECT j.nombre,altura,conferencia,division,e.nombre AS equipo FROM jugadores j INNER JOIN equipos e ON j.Nombre_equipo = e.Nombre ORDER BY altura desc LIMIT 1;
SELECT equipo_local,equipo_visitante,puntos_local,puntos_visitante,(puntos_local +puntos_visitante)/2 AS MEDIA FROM partidos p INNER JOIN equipos e ON p.equipo_local = e.nombre WHERE e.Division = 'Pacific' GROUP BY codigo;
SELECT  equipo_local,equipo_visitante,puntos_local,puntos_visitante,(puntos_local - puntos_visitante) AS DIF,(puntos_visitante - puntos_local) AS DIF FROM partidos ORDER BY(puntos_visitante - puntos_local), (puntos_local - puntos_visitante) DESC; 
SELECT  equipo_local,equipo_visitante,puntos_local,puntos_visitante,(puntos_local - puntos_visitante) AS DIF,(puntos_visitante - puntos_local) AS DIF FROM partidos WHERE (puntos_visitante - puntos_local) > 105 OR (puntos_local - puntos_visitante) > 105 ORDER BY(puntos_visitante - puntos_local), (puntos_local - puntos_visitante);
SELECT equipo_local, equipo_visitante, diferencia FROM (SELECT equipo_local, equipo_visitante, abs(puntos_local - puntos_visitante) as diferencia FROM partidos) t WHERE diferencia = (SELECT max(abs(puntos_local - puntos_visitante)) FROM partidos);
SELECT equipo_local,SUM(puntos_local) FROM PARTIDOS GROUP BY equipo_local;
SELECT equipo_visitante,SUM(puntos_visitante) FROM PARTIDOS GROUP BY equipo_visitante;
SELECT equipo_local,SUM(puntos_local)+SUM(puntos_visitante) FROM PARTIDOS GROUP BY equipo_local;
/*SELECT * FROM (SELECT equipo_local,SUM(puntos_local) FROM PARTIDOS GROUP BY equipo_local) t1 INNER JOIN (SELECT equipo_local,SUM(puntos_visitante) FROM PARTIDOS ) t2 ON t1.equipo_local = t2.equipo_local GROUP BY equipo_local ;*/
SELECT equipo_local,sum(puntos_local)+pv FROM partidos p,(SELECT sum(puntos_visitante) pv,equipo_visitante ev FROM partidos GROUP BY equipo_visitante) v WHERE ev=p.equipo_local GROUP BY equipo_local;
SELECT codigo,equipo_local,equipo_visitante,IF(puntos_local>puntos_visitante, equipo_local, IF(puntos_local<puntos_visitante,equipo_visitante,null)) GANADOR FROM partidos

CREATE TABLE mst_parent (
    id INT PRIMARY KEY,
    name VARCHAR(255),
    parent_id INT,
    FOREIGN KEY (parent_id) REFERENCES mst_parent(id)
);

INSERT INTO mst_parent (id, name, parent_id) VALUES
(1, 'Zaki', 2),
(2, 'Ilham', NULL),
(3, 'Irwan', 2),
(4, 'Arka', 3);

SELECT t1.id, t1.name, t2.name AS parent_name
FROM mst_parent t1
LEFT JOIN mst_parent t2 ON t1.parent_id = t2.id


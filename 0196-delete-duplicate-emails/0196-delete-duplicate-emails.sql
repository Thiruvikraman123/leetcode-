DELETE FROM Person
WHERE id IN (
    SELECT id
    FROM (
        SELECT p1.id
        FROM Person p1
        WHERE p1.id > (
            SELECT MIN(p2.id)
            FROM Person p2
            WHERE p2.email = p1.email
        )
    ) AS duplicates
);
-- 코드를 입력하세요
SELECT a.FLAVOR
FROM FIRST_HALF AS a
JOIN ICECREAM_INFO as b
ON a.FLAVOR = b.FLAVOR
WHERE a.TOTAL_ORDER>3000 AND b.INGREDIENT_TYPE = 'fruit_based'
-- 코드를 입력하세요
SELECT A.AUTHOR_ID, A.AUTHOR_NAME, B.CATEGORY, SUM(S.SALES*B.PRICE) AS TOTAL_SALES
FROM BOOK B
JOIN AUTHOR A
ON B.AUTHOR_ID = A.AUTHOR_ID
JOIN BOOK_SALES S
ON B.BOOK_ID = S.BOOK_ID
WHERE YEAR(S.SALES_DATE)=2022 AND MONTH(S.SALES_DATE) = 1
GROUP BY A.AUTHOR_ID, CATEGORY
ORDER BY A.AUTHOR_ID ASC, B.CATEGORY DESC;


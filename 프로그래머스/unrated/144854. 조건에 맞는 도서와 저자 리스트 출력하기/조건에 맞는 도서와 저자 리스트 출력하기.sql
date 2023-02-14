SELECT B.BOOK_ID, A.AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d')
FROM BOOK B, AUTHOR A
WHERE B.AUTHOR_ID = A.AUTHOR_ID AND B.CATEGORY = '경제'
ORDER BY B.PUBLISHED_DATE

getttken:

curl --location 'http://localhost:8080/oauth2/token' \
--header 'Content-Type: application/x-www-form-urlencoded' \
--header 'Authorization: Basic cmFrc2hhOnRlc3QxMjM0' \
--header 'Cookie: JSESSIONID=EFEB7D015F4F39063A4EE37CF6F50C58' \
--data-urlencode 'grant_type=client_credentials'


private resource:

curl --location 'http://localhost:8080/private/auth' \
--header 'Authorization: Bearer eyJraWQiOiI1NTNmZDFhYS1iOTUzLTQ4NzUtYTMxMS1iOWI5MmU3YWVjYmMiLCJhbGciOiJSUzI1NiJ9.eyJzdWIiOiJyYWtzaGEiLCJhdWQiOiJyYWtzaGEiLCJuYmYiOjE3Mzc3MTExNjUsImlzcyI6Imh0dHA6Ly9sb2NhbGhvc3Q6ODA4MCIsImV4cCI6MTczNzcxNDc2NSwiaWF0IjoxNzM3NzExMTY1fQ.o03jNYGghhMV7oE8lJjq5xSCwy1xRTF9KOZ0oMA1bFDXZ-QT_Ha29Hqnp7H3G4sI5DqUBJdgFhJX2Gj9Wq6XGvG-YP8lSpN1DExXsYwjM80k21b30fBZyHyw50WFcRahZvX4chn_hiQZnSbxBVRs5U39TJOO5Lys9yj0yYaJN84MdmWQw3KzLcFZ4mtKhhsfTaUSZOHNrh6P64-fHRb1HD3zqG5u1xVY7ZLirx6NgKHdI0p8YPWChRS_nX1LCoHKAlxcgczyp9SfOgLguXWimzWY23I7r1PXkhTPf060IENwv4OPsm3t-UmoezUFkE2qGVnjwPwMfbTQ7QQqYlU-Yg' \
--header 'Cookie: JSESSIONID=EFEB7D015F4F39063A4EE37CF6F50C58'

public resource

curl --location 'http://localhost:8080/public/auth' \
--header 'Cookie: JSESSIONID=EFEB7D015F4F39063A4EE37CF6F50C58'

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Top 5 Most Dangerous Viruses</title>
    <link rel="stylesheet" href="/pure-min.css">
    <style>
        .content {
            display: flex;
            flex-flow: column;
            justify-content: center;
        }

        h2 {
            text-align: center;
        }

        .pure-img {
            max-width: 200px;
        }
    </style>
</head>
<body>
    <div class="content">
        <h2>Top 5 Most Dangerous Viruses</h2>
        <br>
        <table class="pure-table pure-table-horizontal">
            <thead>
                <tr>
                    <th>Image</th>
                    <th>Name</th>
                    <th>Description</th>
                    <th>Symptoms</th>
                    <th>Duration</th>
                    <th>Morality Rate</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="d" items="${diseases}">
                    <tr>
                        <td><img class="pure-img" src="${d.imagecolumn}" alt="${d.name} image"></td>
                        <td>${d.name}</td>
                        <td>${d.description}</td>
                        <td>${d.symptoms}</td>
                        <td>${d.duration}</td>
                        <td>${d.mortality}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
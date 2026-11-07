<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Store Directory</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background-color: #f4f6f9;
            margin: 0;
            padding: 40px;
            color: #333;
        }
        .container {
            max-width: 1100px;
            margin: 0 auto;
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.05);
        }
        h2 {
            margin-top: 0;
            color: #2c3e50;
            border-bottom: 2px solid #eaeaea;
            padding-bottom: 15px;
            font-size: 24px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            padding: 14px 16px;
            text-align: left;
            border-bottom: 1px solid #e2e8f0;
        }
        th {
            background-color: #3182ce;
            color: #ffffff;
            font-weight: 600;
            text-transform: uppercase;
            font-size: 12px;
            letter-spacing: 0.8px;
        }
        tr:hover {
            background-color: #f8fafc;
        }
        .badge {
            background-color: #ebf8ff;
            color: #2b6cb0;
            padding: 5px 10px;
            border-radius: 6px;
            font-size: 12px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Registered Store Directory</h2>
        <table>
            <thead>
                <tr>
                    <th>Store Name</th>
                    <th>Location</th>
                    <th>City</th>
                    <th>State</th>
                    <th>Country</th>
                    <th>Zip</th>
                    <th>Contact</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="store" items="${stores}">
                    <tr>
                        <td><strong>${store.storeName}</strong></td>
                        <td>${store.location}</td>
                        <td>${store.city}</td>
                        <td>${store.state}</td>
                        <td>${store.country}</td>
                        <td>${store.zip}</td>
                        <td>${store.phone}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
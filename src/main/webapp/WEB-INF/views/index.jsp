<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

            <!DOCTYPE html>
            <html lang="en">

            <head>
                <meta charset="UTF-8">
                <meta http-equiv="X-UA-Compatible" content="IE=edge">
                <meta name="viewport" content="width=device-width, initial-scale=1.0">

               
                <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

                <script src="<c:url value='resources/js/index.js'/>"></script>
                <title>Employee details</title>

                </script>


                <style>
                    div {
                        margin-bottom: 10px;
                    }

                    label {
                        display: inline-block;
                        width: 200px;

                    }

                    input {
                        padding: 3px 10px;
                    }

                    button {
                        border-radius: 4px;
                        margin-right: 30px;
                        background-color: rgb(231, 62, 62);
                        width: 100px;
                        height: 30px;

                    }

                    body {
                        background-image: linear-gradient(#ffff, rgb(194, 195, 202));
                    }

                    #no {
                        font-family: Arial, Helvetica, sans-serif;
                        border-collapse: collapse;
                        width: 100%;
                    }

                    #no td,
                    #no th {
                        border: 1px solid #ddd;
                        padding: 8px;
                    }

                    #no tr:nth-child(even) {
                        background-color: #f2f2f2;
                    }

                    #no tr:hover {
                        background-color: #ddd;
                    }

                    #no th {
                        padding-top: 12px;
                        padding-bottom: 12px;
                        text-align: left;
                        background-color: #778ef3;
                        color: white;
                    }

                    #field1 {
                        background-image: linear-gradient(#ffffff, rgb(134, 139, 218));
                        width: 100%;
                    }
                </style>

            </head>

            <body>

                <form action="javascript:void(0)" method="post">
                    <div>
                        <fieldset id="field1">
                            <legend>Employee Details</legend>

                            <hr width="100%" align="left">
                            <table width="600" height="200">
                                <tr>
                                    <td height="30"> Employee Id</td>
                                    <td><input type="number" id="employeeId" name ="employeeId"></td>
                                </tr>

                                <tr>
                                    <td height="30"> Employee Name</td>
                                    <td><input type="text" id="employeeName" name="employeeName"></td>
                                </tr>
                                <tr>
                                    <td height="30"> Employee DOB</td>
                                    <td> <input type="date" id="dob" name="dob"></td>
                                </tr>
                                <tr>
                                    <td height="30"> Allocated project</td>

                                    <td id="btn">
                                        <input type="radio" name="allocatedProject" id = "allocatedProject" value="bsibw"> BSIB-WEB
                                        <input type="radio" name="allocatedProject" id ="allocatedProject" value="bsib"> BSIB-DS
                                    </td>
                                </tr>
                                <tr>
                                    <td height="30"> Known Model</td>
                                    <td>
                                        <input type="checkbox" name="knownModel" id ="knownModel" value="Motor"> Motor
                                        <input type="checkbox" name="knownModel" id ="knownModel" value="Non motor"> Non Motor
                                        <input type="checkbox" name="knownModel" id ="knownModel" value="BCN"> BCN

                                    </td>
                                </tr>
                                <tr>
                                    <td height="30"> Email</td>
                                    <td> <input type="email" id="email" name="email"></td>
                                </tr>
                                <tr>
                                    <td height="30"> Phone Number</td>
                                    <td><input type="tel" id="phonenumber" name="phonenumber"></td>
                                </tr>
                            </table>




                            <button onclick="insert()">Insert</button>

                            <button>Update</button>

                            <button onclick="reset()">Reset</button>

                            <button>Cancel</button>

                        </fieldset>


                    </div>
                </form>
                <hr>

                <div class="panel-body">
                    <table id="no">
                        <tr>
                            <th>Employee Id</th>
                            <th>Employee Name:</th>
                            <th>Employee DOB:</th>
                            <th>Allocated project:</th>
                            <th>Known Model:</th>
                            <th>Email:</th>
                            <th>Phone number:</th>
                            <th>Action</th>
                        </tr>

                        <c:forEach var="emp" items="${employees}">

                            <c:url var="updateLink" value="/updateForm">
                                <c:param name="EmployeeId" value="${emp}" />
                            </c:url>

                            <!-- construct an "delete" link with customer id -->
                            <c:url var="deleteLink" value="/delete">
                                <c:param name="EmpID" value="${emp.employeeId}" />
                            </c:url>

                            <tr>
                                <td>${emp.employeeId}</td>
                                <td>${emp.employeeName}</td>
                                <td>${emp.dob}</td>
                                <td>${emp.allocatedProject}</td>
                                <td>${emp.knownModel}</td>
                                <td>${emp.email}</td>
                                <td>${emp.phonenumber}</td>


                                <td>
                                    <!-- display the update link --> <a href="${updateLink}">Update</a>
                                    | <a href="${deleteLink}"
                                        onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
                                </td>

                            </tr>
                        </c:forEach>
                    </table>

                </div>
            </body>

            </html>
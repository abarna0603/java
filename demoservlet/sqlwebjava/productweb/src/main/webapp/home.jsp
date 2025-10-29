<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
     
     <% String email=(String) session.getAttribute("email");
     if(email ==null){
    	 response.sendRedirect("login.jsp");
        	  return; 
          
     }
     %>
<title>student table</title>
 <style>
    /* Base table styling */
    table {
      width: 100%;
      border-collapse: collapse;
      font-family: Arial, sans-serif;
      margin: 1rem 0;
    }

    caption {
      caption-side: top;
      font-size: 1.3em;
      font-weight: bold;
      margin-bottom: 0.5rem;
      text-align: left;
    }

    th, td {
      border: 1px solid #ccc;
      padding: 0.75rem;
      text-align: left;
    }

    thead th {
      background-color: #f2f2f2;
    }

    tbody tr:nth-child(even) {
      background-color: #fafafa;
    }

    tbody tr:hover {
      background-color: #f1f1f1;
    }

    /* Responsive wrapper */
    .table-responsive {
      overflow-x: auto;
    }
  </style>
</head>
<body>
 <h1>Student Records</h1>
  <div class="table-responsive">
    <table>
      <caption>Class 10A – Students List</caption>
      <thead>
        <tr>
          <th>Roll No.</th>
          <th>Name</th>
          <th>Age</th>
          <th>Grade</th>
          <th>Email</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>101</td>
          <td>Aarav Patel</td>
          <td>15</td>
          <td>A+</td>
          <td>aarav.patel@example.com</td>
        </tr>
        <tr>
          <td>102</td>
          <td>Meera Sharma</td>
          <td>16</td>
          <td>A</td>
          <td>meera.sharma@example.com</td>
        </tr>
        <tr>
          <td>103</td>
          <td>Rahul Gupta</td>
          <td>15</td>
          <td>B+</td>
          <td>rahul.gupta@example.com</td>
        </tr>
        <!-- More rows can be added here -->
      </tbody>
    </table>
    <a class="login" href="login.jsp">logout</a>
  </div>

</body>
</html>
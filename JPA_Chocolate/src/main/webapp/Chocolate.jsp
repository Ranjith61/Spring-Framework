<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Page</title>
</head>
<body>
	<h1>Save your Chocolates</h1>
	<form action="chocolate/save" method="post">
		<input type="text" name="name" placeholder="Chocolate Name"><br>
		<input type="number" name="price" placeholder="Price"><br>
		<input type="number" name="quantity" placeholder="Quantity"><br>
		<input type="text" name="manufacturer" placeholder="Manufacturer"><br>

		<button type="Submit">Save</button>
		<br>

	</form>
	<h2>${isExists}</h2>


	<h2>${exists}</h2>

	<h2>Find your chocolate by ID</h2>

	<form action="chocolate/find" method="get">

		<input type="number" name="id" placeholder="Id">
		<button type="Submit">Find</button>

	</form>
	<h2>Read List of Chocolates</h2>
	<form action="chocolate/read" method=get>
		<button type="Submit">Read</button>
	</form>

	<h2>Find by Chocolate Name</h2>
	<form action="chocolate/findByName" method=get>
		<input type="text" name="name" placeholder="Enter a Name"><br>
		<button type="Submit">Search</button>
	</form>

	<h2>${nameNotFound}</h2>
	<h2>${nameNotValid}</h2>

	<p>*************************************<p>
	
	<h2>Update Quantity</h2>
	<form action="chocolate/update" method="post">
		<input type="number" name="quantity" placeholder="Quantity"> <input
			type="text" name="name" placeholder="Chocolate Name">
		<button type="Submit">Update</button>
	</form>
	<h2>${isUpdated}</h2>
	
	<h2>Delete Chocolate</h2>
	<form action="chocolate/delete" method="post">
		<input type="text" name="name" placeholder="Name"> 
				<button type="Submit">Delete</button>
	</form>
	<h2>${isDeleted}</h2>

</body>
</html>


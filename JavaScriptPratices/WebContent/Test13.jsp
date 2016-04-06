<!DOCTYPE html>
<html>
<body>

<form action="action_page.php">
  <fieldset>
    <legend>Personal information:</legend>
    First name:<br>
    <input type="text" name="firstname" value="Mickey">
    <br>
    Last name:<br>
    <input type="text" name="lastname" value="Mouse">
    <br><br>
    <input type="submit" value="Submit">
  </fieldset>
</form>


  <fieldset>
    <legend>Personal information:</legend>
	 <select name="cars">
  		<option value="volvo" selected="selected">Volvo</option>
  		<option value="saab">Saab</option>
  		<option value="fiat">Fiat</option>
  		<option value="audi">Audi</option>
	</select>
  </fieldset>
  
  <textarea rows="10" cols="10">The cat was playing in garden</textarea>
  <button type="button" onclick="alert('Hello rashmiranjan')">Click Here</button>
</body>
</html>
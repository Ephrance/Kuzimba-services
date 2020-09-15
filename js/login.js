function validateForm() {
  var x = document.forms["myForm"]["username"].value;
  var y = document.forms["myForm"]["pass"].value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }

  if (y == "") {
    alert("Password must be filled out");
    return false;
  }
if (x == "kuzimba" && y == "kuzimbacms"  ) {
    alert("Login successful");
    window.location.assign("loggedin.html")
      }

      else{
      	alert("Wrong Password or Username");
      	return false;
      }

}
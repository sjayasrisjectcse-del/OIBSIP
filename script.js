function validateLogin() {
  let u = document.getElementById("user").value;
  let p = document.getElementById("pass").value;

  if(u === "" || p === "") {
    alert("Please fill all fields");
    return false;
  }
  return true;
}

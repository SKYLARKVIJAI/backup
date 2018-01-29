<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="robots" content="noindex, nofollow">

    <title>Sign Up Form - Bootsnipp.com</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
    <style type="text/css">
    @import url('https://fonts.googleapis.com/css?family=Caveat:400,700');
body {
    min-height:100%;
    background:url('http://www.imgion.com/images/01/Chocolate-With-Rose-.jpg');
    font-family: 'Caveat', cursive;
        background-size: cover;
    background-attachment: fixed;
}

.text-center{
  text-align: center;
}

.space-bot{
  margin-bottom: 35px;
}

.space-top{
  margin-top: 35px;
}

/* Title */

h1 {
    color:#FDFF7;
    font-family: 'Roboto';
    text-transform: uppercase;
    font-weight: 900;
    font-size: 25px !important;
    text-align: center;
    font-family: 'Caveat', cursive;
}

/* Sign Up */

.container {
    max-width: 400px;
    max-height: 100px;
    margin-top: 10px;
}

.alert-danger{
  text-align: center;
}

.signup-screen {
    padding: 20px;
    padding-bottom: 40px;
    border-radius: 5px;
    background-color: #593C1F . ;
    
    color: white;
}

.btn{
  border-radius: 2px;
}

.cancel{
  background-color: #df405a;
}

.done{
  background-color: #5CAB7D;
}

.done:hover{
  background-color: #6dc793;
}

.done:focus{
  background-color: #6dc793;
}

.cancel:hover{
  background-color: #f0435f;
}

.cancel:focus{
  background-color: #f0435f;
}

.input-group {
    width:100%;
}

.input-group .ng-invalid {
    border: 2px solid #e74c3c;
    border-radius: 3px;
}

/* Error Box */

.alert{
  padding: 15px;
  margin-bottom: 20px;
  border: 1px solid transparent;
  border-radius: 2px;
  border-color: #e85a71;
  background-color:  #e85a71;
  color: white;
  
}

.help-block {
    font-size: 12px;
    color: white
}
.signup-screen {
    margin-bottom: 10%;
    margin-top: 10%;
}
    </style>
      <link rel='stylesheet prefetch' href='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/css/materialize.min.css'>
<link rel='stylesheet prefetch' href='https://fonts.googleapis.com/icon?family=Material+Icons'>
<link href="https://fonts.googleapis.com/css?family=Caveat:400,700" rel="stylesheet">
    <script src="//code.jquery.com/jquery-1.10.2.min.js"></script>
    <script src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        window.alert = function(){};
        var defaultCSS = document.getElementById('bootstrap-css');
        function changeCSS(css){
            if(css) $('head > link').filter(':first').replaceWith('<link rel="stylesheet" href="'+ css +'" type="text/css" />'); 
            else $('head > link').filter(':first').replaceWith(defaultCSS); 
        }
        $( document ).ready(function() {
          var iframe_height = parseInt($('html').height()); 
          window.parent.postMessage( iframe_height, 'https://bootsnipp.com');
        });
    </script>
</head>


<body>
 <div class="container">
   <div id="signup">
      <div class="signup-screen col-sm-6 col-sm-offset-3">
         <div class="space-bot text-center">
            <h1>Category list </h1>
           <div class="divider"></div>
         </div>
           <form:form class="form-register"  modelAttribute="categorySupportAgent" action="registercat">
              <div class="input-field col s6">
              <form:input id="first-name" type="text" class="validate" path="categoryName"></form:input>
              <label for="first-name">Name</label>
            </div>
            
              <div class="space-top text-center">
          
               <button type="submit" class="waves-effect waves-light btn cancel">
               <i class="material-icons left">submit</i>
               </button>
              </div>
             </form:form>
           </div>
        </div>
    </div>
</body>
 <script src='http://code.jquery.com/jquery-2.1.4.min.js'></script>
<script src='https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.0/js/materialize.min.js'></script>

<!DOCTYPE html>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<!-- Website CSS style -->
		<link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
		<!-- Website Font style -->
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/1.10.13/css/dataTables.bootstrap.min.css">
		<link rel="stylesheet" href="https://cdn.datatables.net/responsive/2.1.1/css/responsive.bootstrap.min.css">
		<!-- Google Fonts -->
		<link href="https://fonts.googleapis.com/css?family=Raleway:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&subset=latin-ext" rel="stylesheet">

		<title>MegaMenu Design</title>
	</head>

</html>
<?php
$mysqli=mysqli_connect("localhost","root","dnjsgpwls","HW2");
if(mysqli_connect_error()){
printf("Connect failed:%s\n", mysqli_connect_error());
exit();
}

else{
$sql="insert into PersonInfo(name,country) values('".$_POST["nameColumn"]."','".$_POST["countryColumn"]."')";
$res=mysqli_query($mysqli, $sql);
echo "Inserted Information: The name is ".$_POST["nameColumn"]." and the country is ".$_POST["countryColumn"]."<br/>";
}

mysqli_close($mysqli);

?>
<?php

$mysqli=mysqli_connect("localhost","root","dnjsgpwls","HW2");

if(mysqli_connect_error()){
printf("Connect failed: %s\n", mysqli_connect_error());
exit();
}

else{
$sql="select p.pid, p.name, f.country, f.flightno
from Flight f, PersonInfo p 
where p.name='".$_POST["titleColumn"]."'and f.country='".$_POST["typeIDColumn"]."'";


$res=mysqli_query($mysqli, $sql);
if($res){
while($newArray=mysqli_fetch_array($res,MYSQLI_ASSOC)){
echo "<table border='1'><tr>";
echo "<tr><td>ID</td><td>NAME</td><td>COUNTRY</td><td>FILGHT NO.</td></tr>";
echo "<tr><td>".$newArray['pid']."</td><td>".$newArray['name']."</td><td>".$newArray['country']."</td><td>".$newArray['flightno']."</td></tr>";

}
}else{
printf("Could not retrieve records: %s\n", mysqli_error($mysqli));
}
mysqli_free_result($res);
mysqli_close($mysqli);
}

?>
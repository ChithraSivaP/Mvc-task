
function insert() {
alert("wwelcome")
    email();
    phone();
    names();
    knownmodel();
  


    function email() {
        alert("wwelcome1")

        var email = document.getElementById('email');
        var mailFormat = /^([a-zA-Z0-9_\.\-])+\@(([a-zA-Z0-9\-])+\.)+([a-zA-Z0-9]{2,4})+$/;
    
        if (email.value == "") {
            alert("  Please enter your Email Id  ");
        }
        else if (!mailFormat.test(email.value)) {
            alert("  Email Address is not valid, Please provide a valid Email ");
            return false;
        }
        else {
            var e = email.value;
        }
    
    }
    
    
    function phone() {
        alert("wwelcome2")
    
        var phoneNo = document.getElementById('phonenumber');
    
        if (phoneNo.value == "" || phoneNo.value == null) {
            alert("Please enter your Mobile No.");
            return false;
        }
        else if (phoneNo.value.length < 10 || phoneNo.value.length > 10) {
            alert("Mobile No. is not valid, Please Enter 10 Digit Mobile No.");
            return false;
        } else {
            p = phoneNo.value
        }
    
    }
    
    function names() {
        alert("wwelcome3")
        var name = document.getElementById('employeeName');
        if (name.value == "") {
            alert(" Please enter your name")
            return false;
    
        } else {
    
        }
    }

function knownmodel (){
    var check1 = document.getElementsByName('knownModel');
    var result = "";

    for(var i = 0; i <check1.length;i++){
        if(check1[i].checked){
            result+=check1[i].value;
        }
    }
    alert(result);
    
}








    // if (document.getElementById("employeeId").value == '' &&
    //     document.getElementById("employeeName").value == '' &&
    //     document.getElementById("dob").value == '' &&
    //     document.getElementById("allocatedProject").value == '' &&
    //     document.getElementById("knownModel").value == '' &&
    //     document.getElementById("email").value == '' &&
    //     document.getElementById("phonenumber").value == ''

    // ) {

    //     alert("ple enter the details")
    //     return false;
    // } else {


        alert("inserted sucessful")
        insert = {
            "e_id": document.getElementById("employeeId").value,
            "e_name": document.getElementById("employeeName").value,
            "e_dob": document.getElementById("dob").value,
            "e_allocateproject": document.getElementById("allocatedProject").value,
            "e_knownmodel": document.getElementById("knownModel").value,
            "e_email": document.getElementById("email").value,
            "e_phoneno": document.getElementById("phonenumber").value
        };
        console.log(insert);

        $.ajax({
            type: "POST",
            url: "http://localhost:9090/saveEmployee",
            data: JSON.stringify(insert),
            contentType:"application/JSON",
            success: function (data) {
                // console.log(data);
            },
            error: function (result) {
                console.log(`Error ${error}`);
            },
        });
    }











function reset() {

    document.getElementById("id").value = "";
    document.getElementById("name").value = "";
    document.getElementById("dob").value = "";
    document.querySelector("radio").value = "";
    document.getElementById("skill").value = "";
    document.getElementById("email").value = "";
    document.getElementById("phone").value = "";

}




















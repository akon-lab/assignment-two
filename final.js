function hmplant(type){
    
    let=document.getElementById('type');
    
    if(type=='type1')
    {
        document.querySelector("#t1").style.display='block';
        document.querySelector("#t2").style.display='none';
        document.querySelector("#t3").style.display='none';
    }
    if(type=='type2')
    {
        document.querySelector("#t1").style.display='none';
        document.querySelector("#t2").style.display='block';
        document.querySelector("#t3").style.display='none';
    }
    if(type=='type3')
    {
        document.querySelector("#t1").style.display='none';
        document.querySelector("#t2").style.display='none';
        document.querySelector("#t3").style.display='block';
    }
}
//js for final.html to switching between option(tropic,dried flowers,decoration)


function openNav(){
    document.getElementById("Navka").style.width='37%';
}
//js to open nav by button burger in header


function closeNav(){
    document.getElementById("Navka").style.width="0";
}
//js for closing nav bu clicking button in nav "x"


function like() {
    alert("Thanks for choosing! Your feedback is very important to us.");
}
//js alert for geting feedback from user when they liked product
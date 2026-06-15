let divison, info;

async function init(){
  let link = "https://bookish-pancake-g4rq9pwvvr7wcv6rj.github.dev/"; //replace with your Dev URL
  let route= "/ada";

  info = await fetch(link+route);
  customers = await info.json();

  generateCards(ada);
}

function generateCards(ada){
  // Display info as Flip Cards
  let centerpanel = document.getElementById("centerpanel");
  centerpanel.innerHTML = ""; //clear out the container

  // initialize strings for front and back HTML content
  let front ="";
  let back ="";

  for(let i=0; i<ada.length; i++){
    let customer = ada[i];
    
    // create HTML for Flip card front
    front  = `<div class="card" >`;
      // add code here
    front += `</div>`;
    
    // create HTML for Flip card back
    back  = `<div class="card" >`;
      // add code here
    back += `</div>`;
    
    // create Flip card object while passing front & back content
    
    // render Flip card in container
  }
}

function filter(){
  let ada = document.getElementById("ada").value;
  console.log(ada);

  let adaList = []; //create a list of customer info

  for(let i=0; i<ada.length;i++){
    let ada = ada[i]; //get each customer's info
    
    if( ada.Ada == ada ) {
          //add to the new list
      adaList.push(adaList);
    }
  }
  console.log(`number found ${adaList.length}`)
  generateCards(adaList);  
}
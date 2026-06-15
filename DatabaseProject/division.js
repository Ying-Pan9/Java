let divison, info;

async function init(){
  let link = "https://bookish-pancake-g4rq9pwvvr7wcv6rj.github.dev/"; //replace with your Dev URL
  let route= "/division";

  info = await fetch(link+route);
  customers = await info.json();

  generateCards(divison);
}

function generateCards(divison){
  // Display info as Flip Cards
  let centerpanel = document.getElementById("centerpanel");
  centerpanel.innerHTML = ""; //clear out the container

  // initialize strings for front and back HTML content
  let front ="";
  let back ="";

  for(let i=0; i<divison.length; i++){
    let customer = divison[i];
    
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
  let divison = document.getElementById("divison").value;
  console.log(divison);

  let divisonList = []; //create a list of customer info

  for(let i=0; i<divison.length;i++){
    let divison = divison[i]; //get each customer's info
    
    if( divison.Divison == divison ) {
          //add to the new list
      divisonList.push(divison);
    }
  }
  console.log(`number found ${divisonList.length}`)
  generateCards(divisonList);  
}
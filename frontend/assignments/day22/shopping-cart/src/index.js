function checkout() {
    let items = document.getElementsByClassName("item");
    console.log(items instanceof Array);
    items.array.forEach(element => {
        if (element.querySelector("input") < 0) {
            alert("Invalid quantity entered for ${element.querySelector('p').innerText}");
        }
    });
/*     items.forEach((element) => {
        if (element.querySelector("input") < 0) {
            alert("Invalid quantity entered for ${element.querySelector('p').innerText}");
        }
    });
 */
    while(true){

    }
}

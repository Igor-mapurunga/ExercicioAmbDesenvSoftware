function contadorDeInteiro(arr) {
  let count = 0;
  for (let i = 0; i < arr.length; i++) {
    if (Math.floor(arr[i]) === arr[i]) {
      count++;
    }
  }
  return count;
}


let data = [1.2, 3, 4.5, 5, 6];
let result = contadorDeInteiro(data);
console.log(result);
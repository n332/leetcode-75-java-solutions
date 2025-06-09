var vowels = ['a','e','i','o','u','A','E','I','O','U'];

var presentedVowels = [];
var positions = [];

for (var i=0; i<s.length; i++){
    if (vowels.includes(s[i])){
        presentedVowels.push(s[i]);
        positions.push(i)
    }
}

presentedVowels.reverse();

let sArray = s.split('');

positions.forEach((pos, index) => {
    sArray[pos] = presentedVowels[index];
});

let newString = sArray.join('');

console.log(newString);
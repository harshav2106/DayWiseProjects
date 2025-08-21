function pair<T, U>(first: T, second: U): [T, U] {
    return [first, second];
}
let numStrPair = pair<number, string>(101, "Harsha");
console.log("Number-String Pair:", numStrPair);

let boolNumPair = pair<boolean, number>(true, 81);
console.log("Boolean-Number Pair:", boolNumPair);

let strBoolPair = pair<string, boolean>("Hello", false);
console.log("String-Boolean Pair:", strBoolPair);
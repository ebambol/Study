void setup() {
  Serial.begin(9600);
  randomSeed(analogRead(0));  //중복없는 난수값 발생
  pinMode(2,INPUT);
}

void loop() {
  int result = digitalRead(2);
  if(result == HIGH) {
  int randNumber = random(1,11); //0에서 299까지
  Serial.println(randNumber);
  }
  delay(1000);
}

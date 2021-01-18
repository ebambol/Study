void setup() {
  Serial.begin(9600);
  randomSeed(analogRead(0)); // 중복없는 난수값 발생
}

void loop() {
 //int randNumber = random(10); // 0에서부터 9까지
 int randNumber = random(1,7); // 1에서 부터 6까지
 Serial.println(randNumber);
 delay(1000);
}

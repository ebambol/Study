int sled = 0;
void setup() {
  Serial.begin(9600);
  pinMode(13, OUTPUT);  //LED 연결 (디지털 출력)
  pinMode(12, OUTPUT);
  pinMode(11, OUTPUT);
  pinMode(9, OUTPUT);
  pinMode(8, OUTPUT);
  pinMode(2, INPUT);  //버튼 연결 (디지털 입력)
}

void loop() {
  int value = digitalRead(2); //버튼 확인
  
  Serial.print("Light:\t");
  Serial.println(value);
  
//  if(value == HIGH) {
    if(value == LOW){
      digitalWrite(13, HIGH);
      digitalWrite(12, HIGH);
      digitalWrite(11, HIGH);
      digitalWrite(9, HIGH);
      digitalWrite(8, HIGH);
    } else {
      digitalWrite(13, LOW);
      digitalWrite(12, LOW);
      digitalWrite(11, LOW);
      digitalWrite(9, LOW);
      digitalWrite(8, LOW);
    }
}

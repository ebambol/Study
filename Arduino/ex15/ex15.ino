int sled = 0; //최초 sled 값 0, 꺼진 상태 0
              //sled 값 1 , 켜진상태 1
              //2번핀이 연결된 버튼을 토글 버튼으로 만들기 LED 켜기 <=> LED끄기
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
  Serial.print(value);
  Serial.print("\tsled: \t");
  Serial.println(sled);
  if(value == HIGH){
    if(sled==1) { sled=0; delay(500); } else {sled=1; delay(500);}
  }
  if(sled==0){
    digitalWrite(13, HIGH);
    digitalWrite(12, HIGH);
    digitalWrite(11, HIGH);
    digitalWrite(9, HIGH);
    digitalWrite(8, HIGH);
  }else {
     digitalWrite(13, LOW);
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
}
//  }
//  if(value == HIGH) {
////    if(value == LOW){
//      digitalWrite(13, HIGH);
//      digitalWrite(12, HIGH);
//      digitalWrite(11, HIGH);
//      digitalWrite(9, HIGH);
//      digitalWrite(8, HIGH);
//    }
//    if(sled == LOW){
//      digitalWrite(13, LOW);
//      digitalWrite(12, LOW);
//      digitalWrite(11, LOW);
//      digitalWrite(9, LOW);
//      digitalWrite(8, LOW);
//    }
//    

int sled = 0; //최초 sled 값 0, LED 모두 꺼진 상태 0
              //sled 값 1, 첫번째 LED 켜진 상태(나머지는 꺼진 상태)
              //sled 값 2, 두번째 LED 켜진 상태(나머지는 꺼진 상태)
              //sled 값 3, 세번째 LED 켜진 상태(나머지는 꺼진 상태)
              //sled 값 4, 네번째 LED 켜진 상태(나머지는 꺼진 상태)
              //sled 값 5, 다섯번째 LED 켜진 상태(나머지는 꺼진 상태)
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
  digitalWrite(13, LOW);  //LED 끄기
  pinMode(3, INPUT);  //버튼 연결 (디지털 입력)    digitalWrite(12, LOW);
  digitalWrite(11, LOW);
  digitalWrite(9, LOW);
  digitalWrite(8, LOW);
  delay(100);
}

void loop() {
  delay(250);
  int value2 = digitalRead(2); //버튼 확인
  int value3 = digitalRead(3);
  if(value2 == HIGH){ //2번핀에 연결된 버튼을 눌렀을 때
    sled++; //0->1->2->3->4->5->0....
    if(sled>5) { sled=0; }
  }
  Serial.print("value2:\t");
  Serial.print(value2);
  Serial.print("\tsled: \t");
  Serial.println(sled);
  if(sled==0){  //sled 값 0, LED 모두 꺼진 상태 0
    digitalWrite(13, LOW);
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
  if(sled==1){  //sled 값 1, 첫번째 LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, HIGH);
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
    if(sled==2){  //sled 값 2, 두번째 LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW);
    digitalWrite(12, HIGH);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
    if(sled==3){  //sled 값 3, 세번째 LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW);
    digitalWrite(12, LOW);
    digitalWrite(11, HIGH);
    digitalWrite(9, LOW);
    digitalWrite(8, LOW);
  }
    if(sled==4){  //sled 값 4, 네번째 LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW);
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, HIGH);
    digitalWrite(8, LOW);
  }
    if(sled==5){  //sled 값 5, 다섯번째 LED 켜진 상태(나머지는 꺼진 상태)
    digitalWrite(13, LOW);
    digitalWrite(12, LOW);
    digitalWrite(11, LOW);
    digitalWrite(9, LOW);
    digitalWrite(8, HIGH);
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

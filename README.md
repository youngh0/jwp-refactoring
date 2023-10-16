# 키친포스

## 요구 사항

### 상품

- [x] 상품을 등록할 수 있다.
- [x] 상품의 가격이 올바르지 않으면 등록할 수 없다.
    - [x] 상품의 가격은 0 원 이상이어야 한다.
- [x] 상품의 목록을 조회할 수 있다.

### 메뉴 그룹

- [x] 메뉴 그룹을 생성할 수 있다.
- [x] 메뉴 그룹 목록을 조회할 수 있다.

### 메뉴

- [x] 메뉴를 생성할 수 있다.
    - [x] 메뉴이름, 메뉴 가격, 메뉴 그룹, 메뉴에 속한 상품 정보가 필요하다.
    - [ ] 메뉴의 가격이 상품의 합보다 클 수 없다.
- [x] 메뉴의 가격이 올바르지 않으면 등록할 수 없다.
    - [x] 메뉴의 가격은 0원 이상이다.
- [x] 메뉴가 속한 메뉴 그룹이 이미 존재해야 한다.
- [x] 메뉴에 존재하는 상품은 이미 존재해야 한다.
- [x] 상품의 가격의 총합은 0원 이상이다.
- [x] 메뉴 목록을 조회할 수 있다.

### 테이블

- [x] 빈 테이블을 생성할 수 있다.
- [x] 테이블 목록을 조회할 수 있다.
- [x] 테이블의 상태를 변경할 수 있다.
    - [x] 주문 테이블 → 빈 테이블 혹은 빈 테이블 → 주문 테이블
    - [x] 테이블이 속한 테이블 그룹이 존재하면 안된다.
    - [x] 주문 테이블의 주문 상태는 조리 혹은 식사여야 한다.
    - [ ] 테이블의 주문 가능 여부 상태가 변경된다.
- [x] 테이블의 방문 손님 수를 설정할 수 있다.
    - [x] 방문 손님 수는 0 이상이다.
    - [x] 손님이 방문하려는 테이블은 이미 존재해야 한다.
    - [x] 방문하려는 테이블은 빈 테이블 상태이면 안된다.
    - [ ] 요청받은 손님 수로 변경된다.

### 테이블 그룹

- [x] 테이블을 합칠 수 있다.
    - [x] 합치려는 테이블의 수는 최소 2개다.
    - [x] 합치려는 테이블에 중복은 허용되지 않는다.
    - [x] 합치려는 테이블들은 모두 실제로 존재하는 테이블이다.
    - [x] 합치려는 테이블들은 빈 테이블이 포함될 수 없다.
    - [ ] 테이블을 합친 이후 합쳐진 테이블은 주문 테이블(emply false)로 변경된다.
- [x] 테이블 그룹을 해체할 수 있다.
    - [x] 해체하려는 그룹의 테이블이 조리 혹은 식사 상태여선 안된다.
    - [ ] 각 테이블은 주문 가능상태로 변경된다.

### 주문

- [x] 메뉴를 주문할 수 있다.
    - [x] 주문 상품은 최소 한 개 이상이다.
    - [x] 주문하려는 상품은 중복될 수 없다.
    - [x] 주문하려는 테이블은 이미 존재해야 한다.
    - [x] 주문하려는 테이블은 빈 테이블이어선 안된다.
    - [ ] 주문의 상태는 조리 상태가 된다.
- [x] 전체 주문 목록을 조회할 수 있다.
- [x] 주문 상태를 변경할 수 있다.
    - [x] 변경하려는 주문이 존재해야 한다.
    - [x] 변경하려는 주문이 이미 완료상태일 수 없다.
    - [ ] 주문의 상태가 요청 받은 상태로 변경된다.

## 용어 사전

| 한글명      | 영문명              | 설명                            |
|----------|------------------|-------------------------------|
| 상품       | product          | 메뉴를 관리하는 기준이 되는 데이터           |
| 메뉴 그룹    | menu group       | 메뉴 묶음, 분류                     |
| 메뉴       | menu             | 메뉴 그룹에 속하는 실제 주문 가능 단위        |
| 메뉴 상품    | menu product     | 메뉴에 속하는 수량이 있는 상품             |
| 금액       | amount           | 가격 * 수량                       |
| 주문 테이블   | order table      | 매장에서 주문이 발생하는 영역              |
| 빈 테이블    | empty table      | 주문을 등록할 수 없는 주문 테이블           |
| 주문       | order            | 매장에서 발생하는 주문                  |
| 주문 상태    | order status     | 주문은 조리 ➜ 식사 ➜ 계산 완료 순서로 진행된다. |
| 방문한 손님 수 | number of guests | 필수 사항은 아니며 주문은 0명으로 등록할 수 있다. |
| 단체 지정    | table group      | 통합 계산을 위해 개별 주문 테이블을 그룹화하는 기능 |
| 주문 항목    | order line item  | 주문에 속하는 수량이 있는 메뉴             |
| 매장 식사    | eat in           | 포장하지 않고 매장에서 식사하는 것           |

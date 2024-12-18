package c_18_static.singleton.products;

public class ProductView {
    // 싱글톤 패턴으로 작성
    public static ProductView instance = null;

    private ProductView(){
        System.out.println("생성자");
    }

    public static ProductView getInstance(){
        if(instance == null){
            instance = new ProductView();
        }
        return instance;
    }

    public void showMainView(){
        System.out.println("상품 정보를 보여주는 메인화면");
    }

    public void showOrderView(){
        System.out.println("주문 정보를 보여주는 메인화면");
    }
}

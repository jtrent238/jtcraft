/*    */ import org.lwjgl.input.Mouse;
/*    */ 
/*    */ public class bbg
/*    */ {
/*    */   public int a;
/*    */   public int b;
/*    */   
/*    */   public void a()
/*    */   {
/* 10 */     Mouse.setGrabbed(true);
/* 11 */     this.a = 0;
/* 12 */     this.b = 0;
/*    */   }
/*    */   
/*    */   public void b() {
/* 16 */     Mouse.setCursorPosition(org.lwjgl.opengl.Display.getWidth() / 2, org.lwjgl.opengl.Display.getHeight() / 2);
/* 17 */     Mouse.setGrabbed(false);
/*    */   }
/*    */   
/*    */   public void c() {
/* 21 */     this.a = Mouse.getDX();
/* 22 */     this.b = Mouse.getDY();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bbg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
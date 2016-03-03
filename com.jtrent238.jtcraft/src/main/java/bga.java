/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bga
/*    */   implements bci
/*    */ {
/*    */   private final bao a;
/*    */   
/*    */   public bga()
/*    */   {
/* 12 */     this.a = bao.B();
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, bmh parambmh, int paramInt6, int paramInt7, boolean paramBoolean)
/*    */   {
/* 17 */     int i = paramInt3 + paramInt5 / 2 - this.a.l.a / 2;
/* 18 */     this.a.l.b(brp.a("lanServer.scanning", new Object[0]), this.a.n.l / 2 - this.a.l.a(brp.a("lanServer.scanning", new Object[0])) / 2, i, 16777215);
/*    */     String str;
/* 20 */     switch ((int)(bao.K() / 300L % 4L)) {
/*    */     case 0: 
/*    */     default: 
/* 23 */       str = "O o o";
/* 24 */       break;
/*    */     case 1: 
/*    */     case 3: 
/* 27 */       str = "o O o";
/* 28 */       break;
/*    */     case 2: 
/* 30 */       str = "o o O";
/*    */     }
/*    */     
/* 33 */     this.a.l.b(str, this.a.n.l / 2 - this.a.l.a(str) / 2, i + this.a.l.a, 8421504);
/*    */   }
/*    */   
/*    */   public boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
/*    */   {
/* 38 */     return false;
/*    */   }
/*    */   
/*    */   public void b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {}
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
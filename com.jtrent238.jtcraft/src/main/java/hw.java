/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class hw
/*    */   extends ft
/*    */ {
/*    */   private int a;
/*    */   private List b;
/*    */   
/*    */   public hw() {}
/*    */   
/*    */   public hw(int paramInt, te paramte, boolean paramBoolean)
/*    */   {
/* 19 */     this.a = paramInt;
/* 20 */     if (paramBoolean) {
/* 21 */       this.b = paramte.c();
/*    */     } else {
/* 23 */       this.b = paramte.b();
/*    */     }
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 29 */     this.a = paramet.readInt();
/* 30 */     this.b = te.b(paramet);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 35 */     paramet.writeInt(this.a);
/* 36 */     te.a(this.b, paramet);
/*    */   }
/*    */   
/*    */   public void a(fv paramfv)
/*    */   {
/* 41 */     paramfv.a(this);
/*    */   }
/*    */   
/*    */   public List c() {
/* 45 */     return this.b;
/*    */   }
/*    */   
/*    */   public int d() {
/* 49 */     return this.a;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\hw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
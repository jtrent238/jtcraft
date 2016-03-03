/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class je
/*    */   extends jd
/*    */ {
/*    */   public je()
/*    */   {
/* 66 */     this.h = true;
/*    */   }
/*    */   
/*    */   public je(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, boolean paramBoolean) {
/* 70 */     this.a = paramDouble1;
/* 71 */     this.b = paramDouble2;
/* 72 */     this.d = paramDouble3;
/* 73 */     this.c = paramDouble4;
/* 74 */     this.g = paramBoolean;
/* 75 */     this.h = true;
/*    */   }
/*    */   
/*    */   public void a(et paramet)
/*    */   {
/* 80 */     this.a = paramet.readDouble();
/* 81 */     this.b = paramet.readDouble();
/* 82 */     this.d = paramet.readDouble();
/* 83 */     this.c = paramet.readDouble();
/* 84 */     super.a(paramet);
/*    */   }
/*    */   
/*    */   public void b(et paramet)
/*    */   {
/* 89 */     paramet.writeDouble(this.a);
/* 90 */     paramet.writeDouble(this.b);
/* 91 */     paramet.writeDouble(this.d);
/* 92 */     paramet.writeDouble(this.c);
/* 93 */     super.b(paramet);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\je.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ public class vo extends vu
/*    */ {
/*    */   private final Class a;
/*    */   private final int b;
/*    */   private final vq e;
/*    */   private final sj f;
/*    */   private sv g;
/*    */   
/*    */   public vo(td paramtd, Class paramClass, int paramInt, boolean paramBoolean)
/*    */   {
/* 15 */     this(paramtd, paramClass, paramInt, paramBoolean, false);
/*    */   }
/*    */   
/*    */   public vo(td paramtd, Class paramClass, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
/* 19 */     this(paramtd, paramClass, paramInt, paramBoolean1, paramBoolean2, null);
/*    */   }
/*    */   
/*    */   public vo(td paramtd, Class paramClass, int paramInt, boolean paramBoolean1, boolean paramBoolean2, sj paramsj) {
/* 23 */     super(paramtd, paramBoolean1, paramBoolean2);
/* 24 */     this.a = paramClass;
/* 25 */     this.b = paramInt;
/* 26 */     this.e = new vq(paramtd);
/* 27 */     a(1);
/*    */     
/* 29 */     this.f = new vp(this, paramsj);
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public boolean a()
/*    */   {
/* 41 */     if ((this.b > 0) && (this.c.aI().nextInt(this.b) != 0)) { return false;
/*    */     }
/* 43 */     double d = f();
/* 44 */     List localList = this.c.o.a(this.a, this.c.C.b(d, 4.0D, d), this.f);
/* 45 */     Collections.sort(localList, this.e);
/*    */     
/* 47 */     if (localList.isEmpty()) {
/* 48 */       return false;
/*    */     }
/* 50 */     this.g = ((sv)localList.get(0));
/* 51 */     return true;
/*    */   }
/*    */   
/*    */ 
/*    */   public void c()
/*    */   {
/* 57 */     this.c.d(this.g);
/* 58 */     super.c();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
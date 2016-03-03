/*    */ import org.lwjgl.opengl.GL11;
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
/*    */ public class bnq
/*    */   extends bno
/*    */ {
/* 17 */   private final blm a = new blm();
/*    */   
/*    */   public bnq() {
/* 20 */     this.d = 0.5F;
/*    */   }
/*    */   
/*    */   public void a(xj paramxj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/*    */   {
/* 25 */     ahb localahb = paramxj.e();
/* 26 */     aji localaji = paramxj.f();
/*    */     
/* 28 */     int i = qh.c(paramxj.s);
/* 29 */     int j = qh.c(paramxj.t);
/* 30 */     int k = qh.c(paramxj.u);
/* 31 */     if ((localaji != null) && (localaji != localahb.a(i, j, k)))
/*    */     {
/* 33 */       GL11.glPushMatrix();
/* 34 */       GL11.glTranslatef((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/*    */       
/* 36 */       b(paramxj);
/*    */       
/* 38 */       GL11.glDisable(2896);
/* 39 */       bmh localbmh; if ((localaji instanceof ajb)) {
/* 40 */         this.a.a = localahb;
/* 41 */         localbmh = bmh.a;
/* 42 */         localbmh.b();
/* 43 */         localbmh.b(-i - 0.5F, -j - 0.5F, -k - 0.5F);
/* 44 */         this.a.a((ajb)localaji, i, j, k, paramxj.a);
/* 45 */         localbmh.b(0.0D, 0.0D, 0.0D);
/* 46 */         localbmh.a();
/* 47 */       } else if ((localaji instanceof akp)) {
/* 48 */         this.a.a = localahb;
/* 49 */         localbmh = bmh.a;
/* 50 */         localbmh.b();
/* 51 */         localbmh.b(-i - 0.5F, -j - 0.5F, -k - 0.5F);
/* 52 */         this.a.a((akp)localaji, i, j, k);
/* 53 */         localbmh.b(0.0D, 0.0D, 0.0D);
/* 54 */         localbmh.a();
/*    */       } else {
/* 56 */         this.a.a(localaji);
/* 57 */         this.a.a(localaji, localahb, i, j, k, paramxj.a);
/*    */       }
/* 59 */       GL11.glEnable(2896);
/* 60 */       GL11.glPopMatrix();
/*    */     }
/*    */   }
/*    */   
/*    */   protected bqx a(xj paramxj)
/*    */   {
/* 66 */     return bpz.b;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bnq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
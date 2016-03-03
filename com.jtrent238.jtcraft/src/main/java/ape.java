/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ape
/*    */   extends aor
/*    */ {
/*    */   public float a;
/*    */   public float i;
/*    */   public int j;
/*    */   private int k;
/*    */   
/*    */   public void h()
/*    */   {
/* 17 */     super.h();
/*    */     
/* 19 */     if (++this.k % 20 * 4 == 0) {
/* 20 */       this.b.c(this.c, this.d, this.e, ajn.bB, 1, this.j);
/*    */     }
/*    */     
/* 23 */     this.i = this.a;
/*    */     
/* 25 */     float f1 = 0.1F;
/* 26 */     double d2; if ((this.j > 0) && (this.a == 0.0F)) {
/* 27 */       double d1 = this.c + 0.5D;
/* 28 */       d2 = this.e + 0.5D;
/*    */       
/* 30 */       this.b.a(d1, this.d + 0.5D, d2, "random.chestopen", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*    */     }
/* 32 */     if (((this.j == 0) && (this.a > 0.0F)) || ((this.j > 0) && (this.a < 1.0F))) {
/* 33 */       float f2 = this.a;
/* 34 */       if (this.j > 0) this.a += f1; else
/* 35 */         this.a -= f1;
/* 36 */       if (this.a > 1.0F) {
/* 37 */         this.a = 1.0F;
/*    */       }
/* 39 */       float f3 = 0.5F;
/* 40 */       if ((this.a < f3) && (f2 >= f3)) {
/* 41 */         d2 = this.c + 0.5D;
/* 42 */         double d3 = this.e + 0.5D;
/*    */         
/* 44 */         this.b.a(d2, this.d + 0.5D, d3, "random.chestclosed", 0.5F, this.b.s.nextFloat() * 0.1F + 0.9F);
/*    */       }
/* 46 */       if (this.a < 0.0F) {
/* 47 */         this.a = 0.0F;
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public boolean c(int paramInt1, int paramInt2)
/*    */   {
/* 54 */     if (paramInt1 == 1) {
/* 55 */       this.j = paramInt2;
/* 56 */       return true;
/*    */     }
/* 58 */     return super.c(paramInt1, paramInt2);
/*    */   }
/*    */   
/*    */   public void s()
/*    */   {
/* 63 */     u();
/* 64 */     super.s();
/*    */   }
/*    */   
/*    */   public void a() {
/* 68 */     this.j += 1;
/* 69 */     this.b.c(this.c, this.d, this.e, ajn.bB, 1, this.j);
/*    */   }
/*    */   
/*    */   public void b() {
/* 73 */     this.j -= 1;
/* 74 */     this.b.c(this.c, this.d, this.e, ajn.bB, 1, this.j);
/*    */   }
/*    */   
/*    */   public boolean a(yz paramyz) {
/* 78 */     if (this.b.o(this.c, this.d, this.e) != this) return false;
/* 79 */     if (paramyz.e(this.c + 0.5D, this.d + 0.5D, this.e + 0.5D) > 64.0D) { return false;
/*    */     }
/* 81 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\ape.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
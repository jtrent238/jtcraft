/*    */ import com.google.common.collect.Lists;
/*    */ import java.util.List;
/*    */ import java.util.Random;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bto
/*    */   implements btu
/*    */ {
/* 12 */   private final List a = Lists.newArrayList();
/*    */   
/* 14 */   private final Random b = new Random();
/*    */   private final bqx c;
/*    */   private final w d;
/*    */   private double e;
/*    */   private double f;
/*    */   
/*    */   public bto(bqx parambqx, double paramDouble1, double paramDouble2, w paramw)
/*    */   {
/* 22 */     this.c = parambqx;
/* 23 */     this.f = paramDouble2;
/* 24 */     this.e = paramDouble1;
/* 25 */     this.d = paramw;
/*    */   }
/*    */   
/*    */   public int a()
/*    */   {
/* 30 */     int i = 0;
/* 31 */     for (btu localbtu : this.a) {
/* 32 */       i += localbtu.a();
/*    */     }
/* 34 */     return i;
/*    */   }
/*    */   
/*    */ 
/*    */   public bti b()
/*    */   {
/* 40 */     int i = a();
/*    */     
/* 42 */     if ((this.a.isEmpty()) || (i == 0)) { return btp.a;
/*    */     }
/* 44 */     int j = this.b.nextInt(i);
/* 45 */     for (btu localbtu : this.a) {
/* 46 */       j -= localbtu.a();
/*    */       
/* 48 */       if (j < 0) {
/* 49 */         bti localbti = (bti)localbtu.g();
/*    */         
/*    */ 
/* 52 */         localbti.a(localbti.b() * this.e);
/* 53 */         localbti.b(localbti.c() * this.f);
/*    */         
/* 55 */         return localbti;
/*    */       }
/*    */     }
/*    */     
/* 59 */     return btp.a;
/*    */   }
/*    */   
/*    */   public void a(btu parambtu) {
/* 63 */     this.a.add(parambtu);
/*    */   }
/*    */   
/*    */   public bqx c() {
/* 67 */     return this.c;
/*    */   }
/*    */   
/*    */   public w d() {
/* 71 */     return this.d;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bto.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
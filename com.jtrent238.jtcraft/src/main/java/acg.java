/*    */ import com.google.common.collect.Multimap;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class acg
/*    */   extends adb
/*    */ {
/*    */   private Set c;
/* 15 */   protected float a = 4.0F;
/*    */   private float d;
/*    */   protected adc b;
/*    */   
/*    */   protected acg(float paramFloat, adc paramadc, Set paramSet)
/*    */   {
/* 21 */     this.b = paramadc;
/* 22 */     this.c = paramSet;
/* 23 */     this.h = 1;
/* 24 */     f(paramadc.a());
/* 25 */     this.a = paramadc.b();
/* 26 */     this.d = (paramFloat + paramadc.c());
/* 27 */     a(abt.i);
/*    */   }
/*    */   
/*    */   public float a(add paramadd, aji paramaji)
/*    */   {
/* 32 */     return this.c.contains(paramaji) ? this.a : 1.0F;
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd, sv paramsv1, sv paramsv2)
/*    */   {
/* 37 */     paramadd.a(2, paramsv2);
/* 38 */     return true;
/*    */   }
/*    */   
/*    */ 
/*    */   public boolean a(add paramadd, ahb paramahb, aji paramaji, int paramInt1, int paramInt2, int paramInt3, sv paramsv)
/*    */   {
/* 44 */     if (paramaji.f(paramahb, paramInt1, paramInt2, paramInt3) != 0.0D) paramadd.a(1, paramsv);
/* 45 */     return true;
/*    */   }
/*    */   
/*    */   public boolean f()
/*    */   {
/* 50 */     return true;
/*    */   }
/*    */   
/*    */   public adc i() {
/* 54 */     return this.b;
/*    */   }
/*    */   
/*    */   public int c()
/*    */   {
/* 59 */     return this.b.e();
/*    */   }
/*    */   
/*    */   public String j() {
/* 63 */     return this.b.toString();
/*    */   }
/*    */   
/*    */   public boolean a(add paramadd1, add paramadd2)
/*    */   {
/* 68 */     if (this.b.f() == paramadd2.b()) {
/* 69 */       return true;
/*    */     }
/* 71 */     return super.a(paramadd1, paramadd2);
/*    */   }
/*    */   
/*    */   public Multimap k()
/*    */   {
/* 76 */     Multimap localMultimap = super.k();
/*    */     
/* 78 */     localMultimap.put(yj.e.a(), new tj(f, "Tool modifier", this.d, 0));
/*    */     
/* 80 */     return localMultimap;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\acg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
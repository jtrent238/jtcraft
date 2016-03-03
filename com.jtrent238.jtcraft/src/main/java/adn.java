/*    */ import com.google.common.collect.Sets;
/*    */ import java.util.Set;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class adn
/*    */   extends acg
/*    */ {
/* 11 */   private static final Set c = Sets.newHashSet(new aji[] { ajn.e, ajn.T, ajn.U, ajn.b, ajn.A, ajn.Y, ajn.p, ajn.S, ajn.q, ajn.R, ajn.o, ajn.ag, ajn.ah, ajn.aD, ajn.aL, ajn.x, ajn.y, ajn.ax, ajn.ay, ajn.aq, ajn.E, ajn.D, ajn.cc });
/*    */   
/*    */ 
/*    */ 
/*    */   protected adn(adc paramadc)
/*    */   {
/* 17 */     super(2.0F, paramadc, c);
/*    */   }
/*    */   
/*    */   public boolean b(aji paramaji)
/*    */   {
/* 22 */     if (paramaji == ajn.Z) return this.b.d() == 3;
/* 23 */     if ((paramaji == ajn.ah) || (paramaji == ajn.ag)) return this.b.d() >= 2;
/* 24 */     if ((paramaji == ajn.bA) || (paramaji == ajn.bE)) return this.b.d() >= 2;
/* 25 */     if ((paramaji == ajn.R) || (paramaji == ajn.o)) return this.b.d() >= 2;
/* 26 */     if ((paramaji == ajn.S) || (paramaji == ajn.p)) return this.b.d() >= 1;
/* 27 */     if ((paramaji == ajn.y) || (paramaji == ajn.x)) return this.b.d() >= 1;
/* 28 */     if ((paramaji == ajn.ax) || (paramaji == ajn.ay)) return this.b.d() >= 2;
/* 29 */     if (paramaji.o() == awt.e) return true;
/* 30 */     if (paramaji.o() == awt.f) return true;
/* 31 */     if (paramaji.o() == awt.g) return true;
/* 32 */     return false;
/*    */   }
/*    */   
/*    */   public float a(add paramadd, aji paramaji)
/*    */   {
/* 37 */     if ((paramaji.o() == awt.f) || (paramaji.o() == awt.g) || (paramaji.o() == awt.e)) {
/* 38 */       return this.a;
/*    */     }
/* 40 */     return super.a(paramadd, paramaji);
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\adn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
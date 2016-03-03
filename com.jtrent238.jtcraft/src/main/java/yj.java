/*    */ import java.util.Collection;
/*    */ import java.util.UUID;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class yj
/*    */ {
/* 11 */   private static final Logger f = ;
/* 12 */   public static final th a = new to("generic.maxHealth", 20.0D, 0.0D, Double.MAX_VALUE).a("Max Health").a(true);
/* 13 */   public static final th b = new to("generic.followRange", 32.0D, 0.0D, 2048.0D).a("Follow Range");
/* 14 */   public static final th c = new to("generic.knockbackResistance", 0.0D, 0.0D, 1.0D).a("Knockback Resistance");
/* 15 */   public static final th d = new to("generic.movementSpeed", 0.699999988079071D, 0.0D, Double.MAX_VALUE).a("Movement Speed").a(true);
/* 16 */   public static final th e = new to("generic.attackDamage", 2.0D, 0.0D, Double.MAX_VALUE);
/*    */   
/*    */   public static dq a(tl paramtl) {
/* 19 */     dq localdq = new dq();
/*    */     
/* 21 */     for (ti localti : paramtl.a()) {
/* 22 */       localdq.a(a(localti));
/*    */     }
/*    */     
/* 25 */     return localdq;
/*    */   }
/*    */   
/*    */   private static dh a(ti paramti) {
/* 29 */     dh localdh = new dh();
/* 30 */     th localth = paramti.a();
/*    */     
/* 32 */     localdh.a("Name", localth.a());
/* 33 */     localdh.a("Base", paramti.b());
/*    */     
/* 35 */     Collection localCollection = paramti.c();
/*    */     
/* 37 */     if ((localCollection != null) && (!localCollection.isEmpty())) {
/* 38 */       dq localdq = new dq();
/*    */       
/* 40 */       for (tj localtj : localCollection) {
/* 41 */         if (localtj.e()) {
/* 42 */           localdq.a(a(localtj));
/*    */         }
/*    */       }
/*    */       
/* 46 */       localdh.a("Modifiers", localdq);
/*    */     }
/*    */     
/* 49 */     return localdh;
/*    */   }
/*    */   
/*    */   private static dh a(tj paramtj) {
/* 53 */     dh localdh = new dh();
/*    */     
/* 55 */     localdh.a("Name", paramtj.b());
/* 56 */     localdh.a("Amount", paramtj.d());
/* 57 */     localdh.a("Operation", paramtj.c());
/* 58 */     localdh.a("UUIDMost", paramtj.a().getMostSignificantBits());
/* 59 */     localdh.a("UUIDLeast", paramtj.a().getLeastSignificantBits());
/*    */     
/* 61 */     return localdh;
/*    */   }
/*    */   
/*    */   public static void a(tl paramtl, dq paramdq) {
/* 65 */     for (int i = 0; i < paramdq.c(); i++) {
/* 66 */       dh localdh = paramdq.b(i);
/* 67 */       ti localti = paramtl.a(localdh.j("Name"));
/*    */       
/* 69 */       if (localti != null) {
/* 70 */         a(localti, localdh);
/*    */       } else {
/* 72 */         f.warn("Ignoring unknown attribute '" + localdh.j("Name") + "'");
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   private static void a(ti paramti, dh paramdh) {
/* 78 */     paramti.a(paramdh.i("Base"));
/*    */     
/* 80 */     if (paramdh.b("Modifiers", 9)) {
/* 81 */       dq localdq = paramdh.c("Modifiers", 10);
/*    */       
/* 83 */       for (int i = 0; i < localdq.c(); i++) {
/* 84 */         tj localtj1 = a(localdq.b(i));
/* 85 */         tj localtj2 = paramti.a(localtj1.a());
/* 86 */         if (localtj2 != null) paramti.b(localtj2);
/* 87 */         paramti.a(localtj1);
/*    */       }
/*    */     }
/*    */   }
/*    */   
/*    */   public static tj a(dh paramdh) {
/* 93 */     UUID localUUID = new UUID(paramdh.g("UUIDMost"), paramdh.g("UUIDLeast"));
/* 94 */     return new tj(localUUID, paramdh.j("Name"), paramdh.i("Amount"), paramdh.f("Operation"));
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\yj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
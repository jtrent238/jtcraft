/*    */ import java.util.ArrayList;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class vw
/*    */ {
/*    */   sw a;
/* 11 */   List b = new ArrayList();
/* 12 */   List c = new ArrayList();
/*    */   
/*    */   public vw(sw paramsw) {
/* 15 */     this.a = paramsw;
/*    */   }
/*    */   
/*    */   public void a() {
/* 19 */     this.b.clear();
/* 20 */     this.c.clear();
/*    */   }
/*    */   
/*    */   public boolean a(sa paramsa) {
/* 24 */     if (this.b.contains(paramsa)) return true;
/* 25 */     if (this.c.contains(paramsa)) { return false;
/*    */     }
/* 27 */     this.a.o.C.a("canSee");
/* 28 */     boolean bool = this.a.p(paramsa);
/* 29 */     this.a.o.C.b();
/* 30 */     if (bool) this.b.add(paramsa); else
/* 31 */       this.c.add(paramsa);
/* 32 */     return bool;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\vw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
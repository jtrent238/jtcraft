/*    */ import java.io.File;
/*    */ import java.util.ArrayList;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bjp
/*    */ {
/* 12 */   private static final Logger a = ;
/*    */   private final bao b;
/* 14 */   private final List c = new ArrayList();
/*    */   
/*    */   public bjp(bao parambao) {
/* 17 */     this.b = parambao;
/* 18 */     a();
/*    */   }
/*    */   
/*    */   public void a() {
/*    */     try {
/* 23 */       this.c.clear();
/*    */       
/* 25 */       dh localdh = du.a(new File(this.b.w, "servers.dat"));
/* 26 */       if (localdh == null) { return;
/*    */       }
/* 28 */       dq localdq = localdh.c("servers", 10);
/* 29 */       for (int i = 0; i < localdq.c(); i++) {
/* 30 */         this.c.add(bjn.a(localdq.b(i)));
/*    */       }
/*    */     } catch (Exception localException) {
/* 33 */       a.error("Couldn't load server list", localException);
/*    */     }
/*    */   }
/*    */   
/*    */   public void b() {
/*    */     try {
/* 39 */       dq localdq = new dq();
/* 40 */       for (Object localObject = this.c.iterator(); ((Iterator)localObject).hasNext();) { bjn localbjn = (bjn)((Iterator)localObject).next();
/* 41 */         localdq.a(localbjn.a());
/*    */       }
/*    */       
/* 44 */       localObject = new dh();
/* 45 */       ((dh)localObject).a("servers", localdq);
/* 46 */       du.a((dh)localObject, new File(this.b.w, "servers.dat"));
/*    */     } catch (Exception localException) {
/* 48 */       a.error("Couldn't save server list", localException);
/*    */     }
/*    */   }
/*    */   
/*    */   public bjn a(int paramInt) {
/* 53 */     return (bjn)this.c.get(paramInt);
/*    */   }
/*    */   
/*    */   public void b(int paramInt) {
/* 57 */     this.c.remove(paramInt);
/*    */   }
/*    */   
/*    */   public void a(bjn parambjn) {
/* 61 */     this.c.add(parambjn);
/*    */   }
/*    */   
/*    */   public int c() {
/* 65 */     return this.c.size();
/*    */   }
/*    */   
/*    */   public void a(int paramInt1, int paramInt2) {
/* 69 */     bjn localbjn = a(paramInt1);
/* 70 */     this.c.set(paramInt1, a(paramInt2));
/* 71 */     this.c.set(paramInt2, localbjn);
/* 72 */     b();
/*    */   }
/*    */   
/*    */   public void a(int paramInt, bjn parambjn) {
/* 76 */     this.c.set(paramInt, parambjn);
/*    */   }
/*    */   
/*    */   public static void b(bjn parambjn) {
/* 80 */     bjp localbjp = new bjp(bao.B());
/* 81 */     localbjp.a();
/*    */     
/* 83 */     for (int i = 0; i < localbjp.c(); i++) {
/* 84 */       bjn localbjn = localbjp.a(i);
/*    */       
/* 86 */       if ((localbjn.a.equals(parambjn.a)) && (localbjn.b.equals(parambjn.b))) {
/* 87 */         localbjp.a(i, parambjn);
/* 88 */         break;
/*    */       }
/*    */     }
/*    */     
/* 92 */     localbjp.b();
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bjp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
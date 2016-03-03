/*    */ import com.google.gson.JsonParseException;
/*    */ import java.io.IOException;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class bgh
/*    */   extends bgg
/*    */ {
/* 17 */   private static final Logger c = ;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 23 */   private final bra d = this.a.R().b;
/*    */   private final bqx e;
/*    */   
/*    */   public bgh(bgf parambgf)
/*    */   {
/* 22 */     super(parambgf);
/*    */     
/*    */     bpq localbpq;
/*    */     try
/*    */     {
/* 27 */       localbpq = new bpq(this.d.a());
/*    */     } catch (IOException localIOException) {
/* 29 */       localbpq = bqi.a;
/*    */     }
/*    */     
/* 32 */     this.e = this.a.P().a("texturepackicon", localbpq);
/*    */   }
/*    */   
/*    */   protected String a()
/*    */   {
/*    */     try {
/* 38 */       bsg localbsg = (bsg)this.d.a(this.a.R().c, "pack");
/* 39 */       if (localbsg != null) {
/* 40 */         return localbsg.a().d();
/*    */       }
/*    */     } catch (JsonParseException localJsonParseException) {
/* 43 */       c.error("Couldn't load metadata info", localJsonParseException);
/*    */     } catch (IOException localIOException) {
/* 45 */       c.error("Couldn't load metadata info", localIOException);
/*    */     }
/*    */     
/* 48 */     return a.m + "Missing " + "pack.mcmeta" + " :(";
/*    */   }
/*    */   
/*    */   protected boolean e()
/*    */   {
/* 53 */     return false;
/*    */   }
/*    */   
/*    */   protected boolean f()
/*    */   {
/* 58 */     return false;
/*    */   }
/*    */   
/*    */   protected boolean g()
/*    */   {
/* 63 */     return false;
/*    */   }
/*    */   
/*    */   protected boolean h()
/*    */   {
/* 68 */     return false;
/*    */   }
/*    */   
/*    */   protected String b()
/*    */   {
/* 73 */     return "Default";
/*    */   }
/*    */   
/*    */   protected void c()
/*    */   {
/* 78 */     this.a.P().a(this.e);
/*    */   }
/*    */   
/*    */   protected boolean d()
/*    */   {
/* 83 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bgh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */
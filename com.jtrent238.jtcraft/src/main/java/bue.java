/*     */ import java.util.ArrayList;
/*     */ import java.util.LinkedList;
/*     */ import java.util.List;
/*     */ import org.apache.logging.log4j.LogManager;
/*     */ import org.apache.logging.log4j.Logger;
/*     */ import tv.twitch.AuthToken;
/*     */ import tv.twitch.ErrorCode;
/*     */ import tv.twitch.chat.Chat;
/*     */ import tv.twitch.chat.ChatChannelInfo;
/*     */ import tv.twitch.chat.ChatEvent;
/*     */ import tv.twitch.chat.ChatMessageList;
/*     */ import tv.twitch.chat.ChatTokenizedMessage;
/*     */ import tv.twitch.chat.ChatUserList;
/*     */ import tv.twitch.chat.IChatCallbacks;
/*     */ import tv.twitch.chat.StandardChatAPI;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class bue
/*     */   implements IChatCallbacks
/*     */ {
/*  99 */   private static final Logger p = ;
/*     */   
/*     */ 
/*     */ 
/* 103 */   protected buh a = null;
/*     */   
/* 105 */   protected String b = "";
/* 106 */   protected String c = "";
/*     */   
/* 108 */   protected String d = "";
/* 109 */   protected String e = "";
/* 110 */   protected Chat f = null;
/*     */   
/* 112 */   protected boolean g = false;
/* 113 */   protected boolean h = false;
/* 114 */   protected bug i = bug.a;
/* 115 */   protected AuthToken j = new AuthToken();
/*     */   
/* 117 */   protected List k = new ArrayList();
/* 118 */   protected LinkedList l = new LinkedList();
/* 119 */   protected int m = 128;
/*     */   
/* 121 */   protected boolean n = false;
/* 122 */   protected boolean o = false;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void chatStatusCallback(ErrorCode paramErrorCode)
/*     */   {
/* 131 */     if (ErrorCode.succeeded(paramErrorCode))
/*     */     {
/* 133 */       return;
/*     */     }
/*     */     
/* 136 */     this.i = bug.e;
/*     */   }
/*     */   
/*     */   public void chatChannelMembershipCallback(ChatEvent paramChatEvent, ChatChannelInfo paramChatChannelInfo)
/*     */   {
/* 141 */     switch (buf.a[paramChatEvent.ordinal()])
/*     */     {
/*     */ 
/*     */     case 1: 
/* 145 */       this.i = bug.d;
/* 146 */       p();
/* 147 */       break;
/*     */     
/*     */ 
/*     */     case 2: 
/* 151 */       this.i = bug.e;
/* 152 */       break;
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void chatChannelUserChangeCallback(ChatUserList paramChatUserList1, ChatUserList paramChatUserList2, ChatUserList paramChatUserList3)
/*     */   {
/*     */     int i2;
/*     */     
/* 163 */     for (int i1 = 0; i1 < paramChatUserList2.userList.length; i1++)
/*     */     {
/* 165 */       i2 = this.k.indexOf(paramChatUserList2.userList[i1]);
/* 166 */       if (i2 >= 0)
/*     */       {
/* 168 */         this.k.remove(i2);
/*     */       }
/*     */     }
/*     */     
/* 172 */     for (i1 = 0; i1 < paramChatUserList3.userList.length; i1++)
/*     */     {
/*     */ 
/* 175 */       i2 = this.k.indexOf(paramChatUserList3.userList[i1]);
/* 176 */       if (i2 >= 0)
/*     */       {
/* 178 */         this.k.remove(i2);
/*     */       }
/*     */       
/* 181 */       this.k.add(paramChatUserList3.userList[i1]);
/*     */     }
/*     */     
/* 184 */     for (i1 = 0; i1 < paramChatUserList1.userList.length; i1++)
/*     */     {
/* 186 */       this.k.add(paramChatUserList1.userList[i1]);
/*     */     }
/*     */     
/*     */     try
/*     */     {
/* 191 */       if (this.a != null)
/*     */       {
/* 193 */         this.a.a(paramChatUserList1.userList, paramChatUserList2.userList, paramChatUserList3.userList);
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/* 198 */       h(localException.toString());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   public void chatQueryChannelUsersCallback(ChatUserList paramChatUserList) {}
/*     */   
/*     */ 
/*     */   public void chatChannelMessageCallback(ChatMessageList paramChatMessageList)
/*     */   {
/* 209 */     for (int i1 = 0; i1 < paramChatMessageList.messageList.length; i1++)
/*     */     {
/* 211 */       this.l.addLast(paramChatMessageList.messageList[i1]);
/*     */     }
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     try
/*     */     {
/* 245 */       if (this.a != null)
/*     */       {
/* 247 */         this.a.a(paramChatMessageList.messageList);
/*     */       }
/*     */       
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/* 253 */       h(localException.toString());
/*     */     }
/*     */     
/*     */ 
/* 257 */     while (this.l.size() > this.m)
/*     */     {
/* 259 */       this.l.removeFirst();
/*     */     }
/*     */   }
/*     */   
/*     */   public void chatClearCallback(String paramString)
/*     */   {
/* 265 */     o();
/*     */   }
/*     */   
/*     */ 
/*     */   public void emoticonDataDownloadCallback(ErrorCode paramErrorCode)
/*     */   {
/* 271 */     if (ErrorCode.succeeded(paramErrorCode))
/*     */     {
/* 273 */       s();
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void chatChannelTokenizedMessageCallback(ChatTokenizedMessage[] paramArrayOfChatTokenizedMessage) {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(buh parambuh)
/*     */   {
/* 293 */     this.a = parambuh;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean c()
/*     */   {
/* 311 */     return this.i == bug.d;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(AuthToken paramAuthToken)
/*     */   {
/* 337 */     this.j = paramAuthToken;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void a(String paramString)
/*     */   {
/* 354 */     this.d = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public void c(String paramString)
/*     */   {
/* 388 */     this.b = paramString;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bug j()
/*     */   {
/* 414 */     return this.i;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public bue()
/*     */   {
/* 441 */     this.f = new Chat(new StandardChatAPI());
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean d(String paramString)
/*     */   {
/* 451 */     l();
/*     */     
/* 453 */     this.h = false;
/* 454 */     this.c = paramString;
/*     */     
/* 456 */     return f(paramString);
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean l()
/*     */   {
/* 480 */     if ((this.i == bug.d) || (this.i == bug.c))
/*     */     {
/*     */ 
/* 483 */       ErrorCode localErrorCode = this.f.disconnect();
/* 484 */       if (ErrorCode.failed(localErrorCode))
/*     */       {
/* 486 */         String str = ErrorCode.getString(localErrorCode);
/* 487 */         h(String.format("Error disconnecting: %s", new Object[] { str }));
/*     */         
/* 489 */         return false;
/*     */       }
/*     */       
/* 492 */       q();
/*     */     }
/* 494 */     else if (this.i == bug.e)
/*     */     {
/* 496 */       q();
/*     */     }
/*     */     
/* 499 */     return m();
/*     */   }
/*     */   
/*     */   protected boolean f(String paramString)
/*     */   {
/* 504 */     if (this.g)
/*     */     {
/* 506 */       return false;
/*     */     }
/*     */     
/* 509 */     ErrorCode localErrorCode = this.f.initialize(paramString, false);
/* 510 */     if (ErrorCode.failed(localErrorCode))
/*     */     {
/* 512 */       String str = ErrorCode.getString(localErrorCode);
/* 513 */       h(String.format("Error initializing chat: %s", new Object[] { str }));
/*     */       
/* 515 */       q();
/*     */       
/* 517 */       return false;
/*     */     }
/*     */     
/*     */ 
/* 521 */     this.g = true;
/* 522 */     this.f.setChatCallbacks(this);
/* 523 */     this.i = bug.b;
/*     */     
/* 525 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */   protected boolean m()
/*     */   {
/* 531 */     if (this.g)
/*     */     {
/* 533 */       ErrorCode localErrorCode = this.f.shutdown();
/* 534 */       if (ErrorCode.failed(localErrorCode))
/*     */       {
/* 536 */         String str = ErrorCode.getString(localErrorCode);
/* 537 */         h(String.format("Error shutting down chat: %s", new Object[] { str }));
/*     */         
/* 539 */         return false;
/*     */       }
/*     */     }
/*     */     
/* 543 */     this.i = bug.a;
/* 544 */     this.g = false;
/*     */     
/* 546 */     t();
/*     */     
/* 548 */     this.f.setChatCallbacks(null);
/*     */     
/* 550 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void n()
/*     */   {
/* 558 */     if (!this.g)
/*     */     {
/* 560 */       return;
/*     */     }
/*     */     
/* 563 */     ErrorCode localErrorCode = this.f.flushEvents();
/* 564 */     String str; if (ErrorCode.failed(localErrorCode))
/*     */     {
/* 566 */       str = ErrorCode.getString(localErrorCode);
/* 567 */       h(String.format("Error flushing chat events: %s", new Object[] { str }));
/*     */     }
/*     */     
/* 570 */     switch (buf.b[this.i.ordinal()])
/*     */     {
/*     */     case 1: 
/*     */       break;
/*     */     
/*     */ 
/*     */ 
/*     */ 
/*     */     case 2: 
/* 579 */       if (this.h)
/*     */       {
/* 581 */         localErrorCode = this.f.connectAnonymous();
/*     */       }
/*     */       else
/*     */       {
/* 585 */         localErrorCode = this.f.connect(this.c, this.j.data);
/*     */       }
/*     */       
/* 588 */       if (ErrorCode.failed(localErrorCode))
/*     */       {
/* 590 */         str = ErrorCode.getString(localErrorCode);
/* 591 */         h(String.format("Error connecting: %s", new Object[] { str }));
/*     */         
/* 593 */         m();
/*     */         
/* 595 */         q();
/*     */       }
/*     */       else
/*     */       {
/* 599 */         this.i = bug.c;
/* 600 */         r();
/*     */       }
/*     */       
/* 603 */       break;
/*     */     
/*     */ 
/*     */     case 3: 
/*     */       break;
/*     */     
/*     */ 
/*     */     case 4: 
/*     */       break;
/*     */     
/*     */ 
/*     */     case 5: 
/* 615 */       l();
/*     */     }
/*     */     
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   public boolean g(String paramString)
/*     */   {
/* 628 */     if (this.i != bug.d)
/*     */     {
/* 630 */       return false;
/*     */     }
/*     */     
/* 633 */     ErrorCode localErrorCode = this.f.sendMessage(paramString);
/* 634 */     if (ErrorCode.failed(localErrorCode))
/*     */     {
/* 636 */       String str = ErrorCode.getString(localErrorCode);
/* 637 */       h(String.format("Error sending chat message: %s", new Object[] { str }));
/*     */       
/* 639 */       return false;
/*     */     }
/*     */     
/* 642 */     return true;
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */   public void o()
/*     */   {
/* 650 */     this.l.clear();
/*     */     
/*     */     try
/*     */     {
/* 654 */       if (this.a != null)
/*     */       {
/* 656 */         this.a.f();
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/* 661 */       h(localException.toString());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */   protected void p()
/*     */   {
/*     */     try
/*     */     {
/* 671 */       if (this.a != null)
/*     */       {
/* 673 */         this.a.d();
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/* 678 */       h(localException.toString());
/*     */     }
/*     */   }
/*     */   
/*     */   protected void q()
/*     */   {
/*     */     try
/*     */     {
/* 686 */       if (this.a != null)
/*     */       {
/* 688 */         this.a.e();
/*     */       }
/*     */     }
/*     */     catch (Exception localException)
/*     */     {
/* 693 */       h(localException.toString());
/*     */     }
/*     */   }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void r() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void s() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void t() {}
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   protected void h(String paramString)
/*     */   {
/* 755 */     p.error(buo.a, "[Chat controller] {}", new Object[] { paramString });
/*     */   }
/*     */ }


/* Location:              C:\Users\trent\.gradle\caches\minecraft\net\minecraft\minecraft\1.7.10\minecraft-1.7.10.jar!\bue.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */